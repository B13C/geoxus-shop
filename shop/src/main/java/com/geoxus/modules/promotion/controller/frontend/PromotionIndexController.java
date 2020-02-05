package com.geoxus.modules.promotion.controller.frontend;

import cn.hutool.core.lang.Dict;
import com.geoxus.core.common.controller.GXController;
import com.geoxus.core.common.util.GXResultUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop/frontend/")
public class PromotionIndexController implements GXController<Dict> {
    @PostMapping("/index")
    public GXResultUtils index(@RequestBody Dict param) {
        return GXResultUtils.ok().putData(Dict.create().set("user_name", "britton"));
    }
}
