package com.jose.apispring;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
  @GetMapping
  public List<SoftwareEngineer> getSoftwareEngineers() {
    return List.of(new SoftwareEngineer(1, "Jose", "Java,Spring,Sql,Linux,AWS")
    ,new SoftwareEngineer(2, "Gigi", "Photo, Pintrest"));
  }

}
