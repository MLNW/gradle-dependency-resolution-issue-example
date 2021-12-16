import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

@AnalyzeClasses(packages = "example")
class ArchitectureTests {

    @ArchTest
    public void checkServiceApplicationStarters(JavaClasses classes) {
        ArchRuleDefinition.classes()
            .that().areAnnotatedWith("org.springframework.boot.autoconfigure.SpringBootApplication")
            .should().haveSimpleNameEndingWith("Starter")
            .check(classes);
    }
}
