package com.michaelhoffmaninc.microservice.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MicroserviceHolaDropwizardApplication extends Application<MicroserviceHolaDropwizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MicroserviceHolaDropwizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "MicroserviceHolaDropwizard";
    }

    @Override
    public void initialize(final Bootstrap<MicroserviceHolaDropwizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final MicroserviceHolaDropwizardConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
