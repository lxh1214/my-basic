package bean;

import bean.service.ClientService;

/**
 * Created by liuxianhu on 2015/10/15.
 */
public class DefaultServerLocator {

    private static ClientService clientService = new ClientServiceImpl();

    public ClientService createClientService() {
        return clientService;
    }
}
