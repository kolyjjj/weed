package li.koly;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Collections;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "bookEntityManagerFactory",
        transactionManagerRef = "bookTransactionManager",
        basePackages = {"li.koly.book"}
)
public class BookDbConfiguration {

    @Bean(name = "bookDataSource")
    @Primary
    @ConfigurationProperties(prefix = "book.datasource")
    public DataSource bookDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "bookEntityManagerFactory")
    @Primary
    public LocalContainerEntityManagerFactoryBean bookEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("bookDataSource") DataSource bookDataSource) {
        return builder
                .dataSource(bookDataSource)
                .packages("li.koly.book.domain")
                .properties(Collections.singletonMap("hibernate.naming.implicit-strategy",
                        "org.hibernate.cfg.SpringNamingStrategy"))
                .persistenceUnit("book")
                .build();
    }

    @Bean(name = "bookTransactionManager")
    public PlatformTransactionManager bookTransactionManager(
            @Qualifier("bookEntityManagerFactory") EntityManagerFactory bookEntityManagerFactory) {
        return new JpaTransactionManager(bookEntityManagerFactory);
    }
}
