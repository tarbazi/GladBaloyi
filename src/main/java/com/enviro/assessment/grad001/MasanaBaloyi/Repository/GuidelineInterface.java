package com.enviro.assessment.grad001.MasanaBaloyi.Repository;

import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.Guideline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuidelineInterface extends JpaRepository<Guideline, Integer>{

}
