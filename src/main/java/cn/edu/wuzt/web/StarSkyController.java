// cn.edu.wuzt.web.StarSkyController.java
package cn.edu.wuzt.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StarSkyController {

    @GetMapping("/")
    public String index(Model model) {
        // 可以添加模型数据，如果需要
        return "index"; // 返回 index.html 模板
    }
}