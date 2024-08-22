package com.betrybe.agrix.controller.dto;

import com.betrybe.agrix.entity.Farm;

/**
 * The type Farm creation dto.
 */
public record FarmCreationDto(String name, Double size) {

  /**
   * To entity farmId.
   *
   * @return the farmId
   */
  public Farm toEntity() {
    return new Farm(name, size);
  }
}
