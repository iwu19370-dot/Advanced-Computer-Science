class_name Player
extends CharacterBody2D

@export var speed: float = 220.0
@export var jump_velocity: float = -420.0


var score: int = 0


func _ready() -> void:
	print("Player ready: ", name)
	print("Speed:", speed, ", Jump velocity: ", jump_velocity)
