package com.example.demo;

import com.example.demo.listener.ApplicationPreparedEventListener;
import com.example.demo.listener.ApplicationReadyEventListener;
import com.example.demo.listener.ApplicationStartedEventListener;
import com.example.demo.test.FooProperties;
import com.example.demo.test.PostsProperties;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.List;
import java.util.Map;


@SpringBootApplication
@EnableAdminServer
public class DemoApplication {

	public static void main(String[] args) {

//	    ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//	    Binder binder = Binder.get(context.getEnvironment());
//
//	    //获取配置参数
//        FooProperties fooProperties = binder.bind("com.demo", Bindable.of(FooProperties.class)).get();
//        System.out.println(fooProperties.getFoo());
//        //直接获取String参数
//        String foo = binder.bind("com.demo.foo",Bindable.of(String.class)).get();
//        System.out.println(foo);
//
//        //直接获取list参数
//        List<String> list = binder.bind("com.demo.list",Bindable.listOf(String.class)).get();
//        System.out.println(list);
//
//        Map<String,String> map = binder.bind("com.demo.posts",Bindable.mapOf(String.class,String.class)).get();
//        System.out.println(map);
//        for (String string:map.keySet()){
//            System.out.println(string+":"+map.get(string)+" ");
//        }
//
//        List<PostsProperties> map2 = binder.bind("com.demo.posts",Bindable.listOf(PostsProperties.class)).get();
//        System.out.println(map2.get(0));
//
//        System.out.println(context.getEnvironment().containsProperty("com.demo.foo"));
//        System.out.println(context.getEnvironment().getProperty("com.demo.chinese.value"));

        //添加监听器事件
//        SpringApplication app = new SpringApplication(DemoApplication.class);
//        app.addListeners(new ApplicationPreparedEventListener(),new ApplicationReadyEventListener(),new ApplicationStartedEventListener());
//        app.run(args);

        SpringApplication.run(DemoApplication.class, args);
	}

    @Configuration
    public static class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests().anyRequest().permitAll()
                    .and().csrf().disable();
        }
    }
}

