package coursetodo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class CourseJavaBasesTypeSpringAnnotationImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annoCtx = new AnnotationConfigApplicationContext();
		Class<SpringConfigUsingJavaBased> configurationUnit = SpringConfigUsingJavaBased.class;
		annoCtx.register(configurationUnit);
		annoCtx.refresh();
		
		Object obj = annoCtx.getBean("course");
		System.out.println(obj);
	}

}
