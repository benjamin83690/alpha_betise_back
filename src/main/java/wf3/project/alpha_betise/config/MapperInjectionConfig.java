package wf3.project.alpha_betise.config;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.MapperConfig;

@MapperConfig(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface MapperInjectionConfig {

}
