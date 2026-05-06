package controller;

import service.EmployeeService;
import vo.EmployeeVo;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllController implements Controller {
    @Override
    public void execute(Scanner sc) {
        System.out.println("전체 사원 정보를 출력합니다.......");
        ArrayList<EmployeeVo> list = EmployeeService.getInstance().getList();

        for(EmployeeVo vo : list){
            System.out.println(vo);
        }

        System.out.println();
    }
}
