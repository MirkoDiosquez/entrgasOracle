package TiendaElectronica;

public enum Tecnologia {
    ULTRAHD(1800),
    CUATROK(1000),
    FULLHD(800);

    private int resolusion;

    // Constructor
    private Tecnologia(int resolusion)
    {
        this.resolusion = resolusion;
    }

    // Getter
    public int getResolusion()
    {
        return resolusion;
    }
}
