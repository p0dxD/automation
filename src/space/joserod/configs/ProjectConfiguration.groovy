package space.joserod.configs

public class ProjectConfiguration {
    String name
    String version
    String path
    LinkedHashMap values

    public ProjectConfiguration(LinkedHashMap values) {
        this.name = values.name
        this.version = values.version
        this.path = values.path
        this.values = values
    }
}