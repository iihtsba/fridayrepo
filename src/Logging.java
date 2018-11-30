import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logging {
	//added Around Advice
	
	@Before("execution(* *.*(..))")
	public void adv()
	{
		System.out.println("before logging");
	}
	
	
}
