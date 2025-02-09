package com.enviro.assessment.grad001.MasanaBaloyi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.RecyclingTips;

@Repository
public interface RecyclingTipsInterface extends JpaRepository<RecyclingTips, Integer>{

}
