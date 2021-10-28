package com.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class Runner {

    @Autowired
    private static ComputerRepository computerRepository;

    public Runner(ComputerRepository computerRepository){
        this.computerRepository = computerRepository;
    }

    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer = new Computer(null, "Devastator", "Palit", "Celeron", 100., 10);
        ArrayList<Computer> computers = new ArrayList<Computer>();
        computers.add(computer);

        Optional<Computer> c = computerRepository.findById(1);
        computerRepository.saveAll(computers);
    }
}
