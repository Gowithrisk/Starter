/**
 * 
 */
package helloWorld.Interface;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * @author Admin
 *
 */

@Path("")
public interface IHelloWorldRest
{
	@POST
	@Path("hi")
	String sayHello();
}
