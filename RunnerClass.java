package runner;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;


@RunWith(value = JUnitPlatform.class)
@SelectPackages({"pkgA", "pkgB"})
@IncludeTags("Sanity")
public class RunnerClass {

}
