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