# spring-movie-recommender

Educative tutorial on spring

Lesson 1 - Tight coupling

Lesson 2 - Decoupling

Lesson 3 - Beans
- Spring automates the process in lesson 2.
- Creating instances of classes and binding instances based on their dependencies.
- The instances or objects that spring manages is called "beans"
- For spring to manage objects and dependencies, spring needs three things: beans, dependencies, location of beans
- Adding a @Component annotation will tell spring to manage objects (Bean)
- Adding an @Autowire annotation will tell spring that it's a dependency
- Adding @ComponentScan tells spring the location of the beans and where to find them and auto wire the depdencies.
- @SpringBootApplication annotation is composed of @Configuration, @EnableAutoConfiguration, and @ComponentScan

Lesson 4 - @Primary  
 - When spring comes across two beans of the same type, it throws an error
 - One way to resolve this is by making one of the beans the Primary
 - This happens because spring doesn't know which bean to inject
 - Adding @Primary is called autowiring by type

Lesson 5 - Autowiring by Name
- Another way to let spring know which bean to use in the case of conflicting beans is to use the bean with the same name when using it in a class.
- spring takes priority by type first, the second priority is by name

Lesson 6 - @Qualifier / @Component([NAME])
- Another way to give priority to one bean over the other bean (if two of the same types are found).
- Can use either @Qualifier or @Component([name])
- @Qualifier / @Component([name]) > @Primary > Autowiring by Name

Lesson 7 - Constructor and Setter Injection
- Another way for beans to be wired in.
- Constructor Injection is autowiring a dependency using a constructor.
- Setter Injection is wiring a dependency using a setter method
- Using @Autowired directly on a field is called field injection (the most unsafe, as spring sets private fields of the objects.)

Lesson 8 - Singleton vs Prototype scope
- Spring container manages beans (application context and bean factory)
- Bean scope refers to the lifecycle and visibility of beans.
- 6 types of beans (singleton, prototype, request, session, application, websocket)
- The last four scopes are only available in web applications
- Singleton beans are created once and cached. Any call to this bean returns the same reference. Best used to handle stateless cases.
- Prototype beans are created one per request.
- Singleton beans are created before we ask for it, while prototypical bean are created on demand.
- Spring vs Gang of Four singleton (Spring Singleton: One bean per application context, Gang of Four: One bean per JVM)

Lesson 9 - Mixing bean scopes
- When a prototype bean is injected into a singleton bean, it loses its prototype behavior and acts as like a singleton
- Singleton beans get initiated when the application context first runs. In this case a singleton bean (the filter) see's it has a dependency on a prototype bean. It then converts the prototype bean into a singleton bean.
- Need to use the @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS) annotation. This will tell spring to inject a proxy at a prototype bean on initiation.

Lesson 10 - Component Scan
- Use the @ComponentScan to scan for specific packages that your beans need

Lesson 11 - Bean Lifecycle Methods
- @PostConstruct is the annotation that tells spring to invoke a function after the bean's dependencies are wired (such as connecting to a database). The function will always return void.
- @PreDestroy is the annotation that tells spring to invoke a function after removing a bean from the container. 
