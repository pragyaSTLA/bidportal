package com.portal.bid.controller;


import com.portal.bid.entity.RolesPermission;
import com.portal.bid.service.RolesPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/roles-permission")
public class RolesPermissionController {

    @Autowired
    private RolesPermissionService rolesPermissionService;

    @PostMapping
    public ResponseEntity<RolesPermission> create(@RequestBody RolesPermission rolesPermission){
        return ResponseEntity.ok(rolesPermissionService.save(rolesPermission));
    }

    @GetMapping
    public ResponseEntity<List<RolesPermission>> getAll(){
        return ResponseEntity.ok(rolesPermissionService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RolesPermission> getById(@PathVariable int id){
        Optional<RolesPermission> rolesPermission = rolesPermissionService.findByID(id);
        if(rolesPermission.isPresent()){
            return ResponseEntity.ok(rolesPermission.get());

        }
        return ResponseEntity.notFound().build();

    }

    @PutMapping("/{id}")
    public ResponseEntity<RolesPermission> update(@PathVariable int id,@RequestBody RolesPermission rp){
        Optional<RolesPermission> rolesPermission = rolesPermissionService.update(id,rp);

        return rolesPermission.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delte(@PathVariable int id){
        Optional<RolesPermission> rolesPermission = rolesPermissionService.findByID(id);
        if(rolesPermission.isPresent()){
            rolesPermissionService.deletebyID(id);
            return  ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();



    }


}
