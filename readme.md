### Spring view for the @ConfogurationProperties-annotated classes

**documentation is not shown for the bean if**
1) the class doesn't have @Component annotation, but is registered as configuration properties bean using
the @ConfigurationPropertiesScan or @EnableConfigurationProperties annotations

**and**

2) the prefix is set using the @ConfigurationProperties#prefix, not #value