package io.github.cloudduck.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author cloudduck
 * @date 4/15/2018
 */
@ConfigurationProperties( prefix = "cloudduck.gretter" )
public class GreeterProperties
{
    // ============================================================
    // Class Attributes:
    // ============================================================

    private String name;

    // ============================================================
    // Public Methods:
    // ============================================================

    public String getName()
    {
        return name;
    }

    public void setName( final String name )
    {
        this.name = name;
    }
}
