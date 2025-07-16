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