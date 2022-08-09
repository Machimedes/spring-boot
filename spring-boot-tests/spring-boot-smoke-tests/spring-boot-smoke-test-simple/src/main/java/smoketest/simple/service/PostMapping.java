package smoketest.simple.service;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@RequestMapping(method = RequestMethod.POST)
public @interface PostMapping {

	@AliasFor(attribute = "path")
	String[] value() default {};

	@AliasFor(attribute = "value")
	String[] path() default {};
}