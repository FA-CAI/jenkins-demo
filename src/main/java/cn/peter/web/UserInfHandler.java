package cn.peter.web;

import cn.peter.pojo.ResponseResult;
import cn.peter.service.UserInfService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/userInf")
public class UserInfHandler {

    @Resource(name = "userInfService")
    private UserInfService userInfService;



    @ResponseBody
    @RequestMapping("/getName")
    public ResponseResult exist(){
        ResponseResult responseResult=new ResponseResult();

        try {
            String name=userInfService.getCountByLoginname("uuid12sa381hd");
            responseResult.setCode(200);
            responseResult.setCount(1L);
            responseResult.setMsg(name);
        } catch (Exception e) {
            e.printStackTrace();
            responseResult.setCode(500);
            responseResult.setMsg("查询错误，服务器繁忙");
        }
        return responseResult;
    }


}
