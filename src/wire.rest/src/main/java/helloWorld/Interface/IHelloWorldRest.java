/**
 * 
 */
package helloWorld.Interface;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Admin
 *
 */

@Path("")
public interface IHelloWorldRest
{
	@GET
	@Path("hi")
	String sayHello();
}
