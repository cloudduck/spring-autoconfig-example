package io.github.cloudduck.gretter;

/**
 * @author cloudduck
 * @date 4/15/2018
 */
public class Gretter
{
    // ============================================================
    // Class Attributes:
    // ============================================================

    private final GretterConfig gretterConfig;

    // ============================================================
    // Constructors:
    // ============================================================


    public Gretter( final GretterConfig gretterConfig )
    {
        this.gretterConfig = gretterConfig;
    }

    // ============================================================
    // Public Methods:
    // ============================================================

    public String greet()
    {
        return "Hello " + gretterConfig.getProperty( "name" );
    }
}
