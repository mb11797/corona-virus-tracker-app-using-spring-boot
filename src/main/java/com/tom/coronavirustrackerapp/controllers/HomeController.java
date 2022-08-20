package com.tom.coronavirustrackerapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tom.coronavirustrackerapp.models.LocationStats;
import com.tom.coronavirustrackerapp.services.CoronaVirusDataService;

@Controller
public class HomeController {
    
    @Autowired
    private CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        Integer totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        Integer totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totalNewCases);
        return "home";
    }
}
