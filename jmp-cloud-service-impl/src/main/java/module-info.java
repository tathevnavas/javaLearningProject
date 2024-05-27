import realService.ServiceProvider;

module jmp.cloud.service.impl {
    requires transitive jmp.service.api;
    requires jmp.dto;
    exports realService;
    provides serviceInterface.Service with ServiceProvider;
}