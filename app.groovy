@Controller
class MainController { }

@Configuration
class MvcConfig extends WebMvcConfigurerAdapter {
  @Override
  void addResourceHandlers(final ResourceHandlerRegistry registry) {
    registry.addResourceHandler('/**')
        .addResourceLocations('classpath:/static')
        .setCachePeriod(0)
  }
}
