package com.nodedynamics.cerberus.models.nodeservices;

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
@Document(collection="ServiceMethods")
public class ServicesMethodsModel extends CoreModel{
	
    @Id
    private String id;
    private String ServiceMethodName;

}
