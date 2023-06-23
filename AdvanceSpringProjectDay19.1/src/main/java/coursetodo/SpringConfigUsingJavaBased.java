package coursetodo;
import org.springframework.context.annotation.Bean;
public class SpringConfigUsingJavaBased {
	@Bean
	public Course course() {
		Course course = new Course(101,"Java",250,"Udemy",24500);
		return course;
	}
}
