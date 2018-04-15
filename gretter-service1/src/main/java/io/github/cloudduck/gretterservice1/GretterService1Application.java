package io.github.cloudduck.gretterservice1;

import io.github.cloudduck.gretter.Gretter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class GretterService1Application implements CommandLineRunner
{
    private final Gretter gretter;

    public GretterService1Application( final Gretter gretter )
    {
        this.gretter = gretter;
    }

    public static void main( String[] args )
    {
        final SpringApplication springApplication = new SpringApplication( GretterService1Application.class );
        springApplication.setWebApplicationType( WebApplicationType.NONE );
        springApplication.setBannerMode( Banner.Mode.OFF );
        springApplication.run( args );
    }

    @Override
    public void run( final String... args ) throws Exception
    {
        log.info( gretter.greet() );
    }
}
