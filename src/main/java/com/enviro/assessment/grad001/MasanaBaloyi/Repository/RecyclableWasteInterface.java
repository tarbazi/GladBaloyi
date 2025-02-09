package com.enviro.assessment.grad001.MasanaBaloyi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.enviro.assessment.grad001.MasanaBaloyi.API.Model.RecyclableWaste;
import org.springframework.stereotype.Repository;

@Repository
public interface RecyclableWasteInterface extends JpaRepository<RecyclableWaste, Integer>{

}
