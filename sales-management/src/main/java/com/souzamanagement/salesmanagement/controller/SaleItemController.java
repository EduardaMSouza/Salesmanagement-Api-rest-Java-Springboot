package com.souzamanagement.salesmanagement.controller;

import com.souzamanagement.salesmanagement.service.SaleItemService;
import com.souzamanagement.salesmanagement.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sale")
public class SaleItemController {

    @Autowired
    private SaleItemService saleItemService;

    @GetMapping("/{userCode}")
    public ResponseEntity<Object> getSale(@PathVariable Long userCode) {
        var sale = saleItemService.getSaleItems(userCode);
        return new ResponseEntity<>(sale, HttpStatus.OK);
    }
}
