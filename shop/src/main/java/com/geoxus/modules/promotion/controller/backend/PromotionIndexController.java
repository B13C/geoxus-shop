package com.geoxus.modules.promotion.controller.backend;

import cn.hutool.core.lang.Dict;
import com.geoxus.core.common.controller.GXController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("backendPromotionIndexController")
@RequestMapping("/shop/backend/")
public class PromotionIndexController implements GXController<Dict> {
}
