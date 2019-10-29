package org.pierre.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class JpademoApplication implements CommandLineRunner {
    @Autowired
    DetailsRepository detailsRepository;
    @Autowired
    MasterRepository masterRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpademoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Master master = new Master();
        master.setId(1L);
        master.setMasterName("M1");
        Details details1 = new Details();
        details1.setDetailName("D1");
        details1.setId(1L);
        //details1.setMaster(master);

        master.getDetails().add(details1);

        detailsRepository.save(details1);
        masterRepository.save(master);

        List<Master> allMasters = masterRepository.findAll();
        allMasters.forEach(mymaster -> {
            System.out.println(mymaster);
        });
    }
}
