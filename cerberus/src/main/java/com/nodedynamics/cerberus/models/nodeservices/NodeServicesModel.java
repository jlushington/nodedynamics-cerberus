package com.nodedynamics.cerberus.models.nodeservices;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.nodedynamics.cerberus.models.CoreModel;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Builder
@Document(collection="Services")
public class NodeServicesModel extends CoreModel{
	
    @Id
    private String id;
    
    private String ServiceName;
    private Boolean ServiceIsAvtive;
    private String ServiceVersion;
    
    private List<ServicesMethodsModel>ServiceMethods;
    
    
    
	
	

}
