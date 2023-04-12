package com.micro.moviecatelogservice.resources;

import com.micro.moviecatelogservice.model.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatelog(@PathVariable("userId") String userId){

        return Collections.singletonList(new
                CatalogItem("KnightRaider","Test", 6));

    }


}
