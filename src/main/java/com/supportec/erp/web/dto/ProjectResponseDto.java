package com.supportec.erp.web.dto;

import com.supportec.erp.domain.project.Project;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ProjectResponseDto {

    private String projectNo;
    private String name;
    private String address;
    private String possibility;
    private String developer;
    private String constructor;
    private String subcontractor;
    private String designer;
    private String shape;
    private String scale;
    private String form;
    private Float width;
    private Float length;
    private Float height;
    private Integer earthPressure;
    private Integer earthVolume;
    private Integer steel;
    private Float steelCalculation;
    private Integer real;
    private Integer total;
    private Integer expect;
    private String expectType;
    private LocalDateTime accept;
    private LocalDateTime estimate;
    private LocalDateTime contract;
    private String salesResponsibility;
    private String designResponsibility;
    private String constructResponsibility1;
    private String constructResponsibility2;
    private String saleLevel1;
    private String saleLevel2;
    private String activeState;
    private String pendingReason;
    private String pendingReasonText;
    private String contractState;
    private LocalDateTime beginDate;
    private LocalDateTime installDate;
    private LocalDateTime completionDate;
    private String constructState;
    private String installState;
    private String writer;
    private LocalDateTime updateDate;

    public ProjectResponseDto(Project entity) {
        this.projectNo = entity.getProjectNo();
        this.name = entity.getName();
        this.address = entity.getAddress();
        this.possibility = entity.getPossibility();
        this.developer = entity.getDeveloper();
        this.constructor = entity.getConstructor();
        this.subcontractor = entity.getSubcontractor();
        this.designer = entity.getDesigner();
        this.shape = entity.getShape();
        this.scale = entity.getScale();
        this.form = entity.getForm();
        this.width = entity.getWidth();
        this.length = entity.getLength();
        this.height = entity.getHeight();
        this.earthPressure = entity.getEarthPressure();
        this.earthVolume = entity.getEarthVolume();
        this.steel = entity.getSteel();
        this.steelCalculation = entity.getSteelCalculation();
        this.real = entity.getReal();
        this.total = entity.getTotal();
        this.expect = entity.getExpect();
        this.expectType = entity.getExpectType();
        this.accept = entity.getAccept();
        this.estimate = entity.getEstimate();
        this.contract = entity.getContract();
        this.salesResponsibility = entity.getSalesResponsibility();
        this.designResponsibility = entity.getDesignResponsibility();
        this.constructResponsibility1 = entity.getConstructResponsibility1();
        this.constructResponsibility2 = entity.getConstructResponsibility2();
        this.saleLevel1 = entity.getSaleLevel1();
        this.saleLevel2 = entity.getSaleLevel2();
        this.activeState = entity.getActiveState();
        this.pendingReason = entity.getPendingReason();
        this.pendingReasonText = entity.getPendingReasonText();
        this.contractState = entity.getContractState();
        this.beginDate = entity.getBeginDate();
        this.installDate = entity.getInstallDate();
        this.completionDate = entity.getCompletionDate();
        this.constructState = entity.getConstructState();
        this.installState = entity.getInstallState();
        this.writer = entity.getWriter();
        this.updateDate = entity.getUpdateDate();
    }
}
