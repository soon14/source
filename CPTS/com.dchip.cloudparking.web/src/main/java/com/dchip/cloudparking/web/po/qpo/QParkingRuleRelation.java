package com.dchip.cloudparking.web.po.qpo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;

import com.dchip.cloudparking.web.model.po.ParkingRuleRelation;
import com.querydsl.core.types.Path;


/**
 * QParkingRuleRelation is a Querydsl query type for ParkingRuleRelation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QParkingRuleRelation extends EntityPathBase<ParkingRuleRelation> {

    private static final long serialVersionUID = 1142405408L;

    public static final QParkingRuleRelation parkingRuleRelation = new QParkingRuleRelation("parkingRuleRelation");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> parkingId = createNumber("parkingId", Integer.class);

    public final NumberPath<Integer> parkingRuleId = createNumber("parkingRuleId", Integer.class);

    public QParkingRuleRelation(String variable) {
        super(ParkingRuleRelation.class, forVariable(variable));
    }

    public QParkingRuleRelation(Path<? extends ParkingRuleRelation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QParkingRuleRelation(PathMetadata metadata) {
        super(ParkingRuleRelation.class, metadata);
    }

	public NumberPath<Integer> getId() {
		return id;
	}

	public NumberPath<Integer> getParkingId() {
		return parkingId;
	}

	public NumberPath<Integer> getParkingRuleId() {
		return parkingRuleId;
	}

}

