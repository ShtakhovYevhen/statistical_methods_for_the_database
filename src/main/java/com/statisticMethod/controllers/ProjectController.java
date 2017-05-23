package com.statisticMethod.controllers;

import com.statisticMethod.dao.DataVisualizationProjectDAO;
import com.statisticMethod.dao.DatabaseAnaliseProjectDAO;
import com.statisticMethod.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


    @Controller
    @RequestMapping("/project")
    public class ProjectController {
        @Autowired
        DataVisualizationProjectDAO projectDAO;
        @Autowired
        DatabaseAnaliseProjectDAO healthMonitorProjectDAOImpl;

        @RequestMapping(path = "/projectView", method = RequestMethod.GET)
        public String projectView(Model model) {
            return "project";
        }

        @RequestMapping(path = "/visualizationProjectSetup", method = RequestMethod.GET)
        public String visualizationProjectSetup(Model model) {
            return "dataVisualizationProjectInitialSetup";
        }

        @RequestMapping(path = "/databaseAnaliseProjectSetup", method = RequestMethod.GET)
        public String databaseAnaliseSetup(Model model) {
            return "databaseAnaliseProjectInitialSetup";
        }

        @RequestMapping(path = "/visualizationProjectSettings", method = RequestMethod.GET)
        public String visualizationProjectSettings(Model model) {
            return "dataVisualizationAdvancedSettings";
        }

        @RequestMapping(path = "/getById", method = RequestMethod.GET)
        public Project getProjectById(Model model) {
            return null;
        }

        @RequestMapping(path = "/getByName", method = RequestMethod.GET)
        public Project getProjectByName(Model model) {
            return null;
        }
        @RequestMapping(path = "/creteProject",method = RequestMethod.GET)
        public String createProject(Model model){
            return "projectCreation";
        }


        @RequestMapping(path = "/deleteProject", method = RequestMethod.GET)
        @ResponseBody
        public void deleteProject(Project project,
                                  Model model) {
            projectDAO.deleteProject(project);
        }
        @RequestMapping(path = "/dashboard", method = RequestMethod.GET)
        public String userDashboard(Model model) {
            return "dashboard";
        }



    }
