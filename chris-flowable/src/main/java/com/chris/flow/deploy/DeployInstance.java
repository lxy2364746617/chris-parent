package com.chris.flow.deploy;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.repository.ProcessDefinition;

public class DeployInstance {

    private static ProcessEngineConfiguration processEngineConfiguration;

    public static void deployBefore() {
        processEngineConfiguration = new StandaloneProcessEngineConfiguration();
        processEngineConfiguration.setJdbcDriver("com.mysql.cj.jdbc.Driver");
        processEngineConfiguration.setJdbcUrl("jdbc:mysql://localhost:3306/flowable?serverTimezone=UTC&nullCatalogMeansCurrent=true");
        processEngineConfiguration.setJdbcUsername("root");
        processEngineConfiguration.setJdbcPassword("lxy105011");
        processEngineConfiguration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_FALSE);
    }

    public static  void createDeploy() {
        deployBefore();
        ProcessEngine engine = processEngineConfiguration.buildProcessEngine();
        RepositoryService repositoryService = engine.getRepositoryService();
        Deployment deployment = repositoryService.createDeployment()
                .addClasspathResource("chris-vocation.bpmn20.xml")
                .name("请假流程")
                .deploy();
        System.out.println(deployment.getId());
        System.out.println(deployment.getName());
    }

    public static void queryDeploy() {
        deployBefore();
        ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
        ProcessDefinition processDefinition = processEngine.getRepositoryService().createProcessDefinitionQuery().deploymentId("1").singleResult();
        System.out.println(processDefinition.getId());
        System.out.println(processDefinition.getName());
        System.out.println(processDefinition.getDescription());
        System.out.println(processDefinition.getDeploymentId());
    }

    public static void main(String[] args) {
//        createDeploy();

        queryDeploy();

    }

}
