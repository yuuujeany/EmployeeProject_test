package controller;

import exception.EmployeeException;
import service.EmployeeService;
import vo.EmployeeVO;

import java.util.Scanner;

public class UpdateController implements Controller {
    @Override
    public void execute(Scanner sc) {
        System.out.println("사원 정보를 수정을 시작합니다.....");
        System.out.print("수정할 사원번호 : ");
        String id = sc.nextLine();

        try {
            //수정할 사원정보를 가져옴
            EmployeeVO vo = EmployeeService.getInstance().searchEmployee(id);

            System.out.println("등록할 사원명 : ");
            vo.setName(sc.nextLine());
            System.out.println("등록할 직급 : ");
            vo.setPosition(sc.nextLine());
            System.out.println("등록할 급여 : ");
            vo.setSalary(sc.nextInt());sc.nextLine();
            System.out.println("등록할 입사일 : ");
            vo.setHireDate(sc.nextLine());
            System.out.println("사원정보 수정 성공");
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
            System.out.println("사원정보 수정에 실패했습니다.");
        }
    }
}