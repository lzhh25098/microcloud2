package cn.enjoy.Controller;

import cn.enjoy.service.ProductService;
import cn.enjoy.vo.Product;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    private ProductService pd;
    @Resource
    private DiscoveryClient discoveryClient; //进行服务注册与发现
    @RequestMapping(value = "/get/{id}")
    public Object get(@PathVariable("id") long id){
        return pd.findById(id);
    }
    @RequestMapping(value = "/list")
    public Object list(){
        return pd.findAll();
    }
    @RequestMapping(value = "/add")
    public Object add(@RequestBody Product product){
        return pd.create(product);
    }
    @RequestMapping("/discover")
    public Object discover() { // 直接返回发现服务信息
        return this.discoveryClient ;
    }
}
