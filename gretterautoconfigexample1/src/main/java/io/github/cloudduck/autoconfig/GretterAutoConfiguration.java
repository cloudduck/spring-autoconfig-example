package io.github.cloudduck.autoconfig;

import io.github.cloudduck.gretter.Gretter;
import io.github.cloudduck.gretter.GretterConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cloudduck
 * @date 4/15/2018
 */
@Configuration
@ConditionalOnClass( Gretter.class )
@EnableConfigurationProperties( GreeterProperties.class )
public class GretterAutoConfiguration
{
    @Bean
    @ConditionalOnMissingBean
    public GretterConfig gretterConfig( final GreeterProperties greeterProperties )
    {
        final GretterConfig gretterConfig = new GretterConfig();
        gretterConfig.put( "name", greeterProperties.getName() );
        return gretterConfig;
    }

    @Bean
    @ConditionalOnMissingBean
    public Gretter gretter( final GretterConfig gretterConfig )
    {
        return new Gretter( gretterConfig );
    }
}
