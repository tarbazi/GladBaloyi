package com.enviro.assessment.grad001.MasanaBaloyi.Repository;

import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.NonRecyclableWaste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NonRecyclableWasteInterface extends JpaRepository<NonRecyclableWaste, Integer>{

}
