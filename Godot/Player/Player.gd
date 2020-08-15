extends KinematicBody2D

const ACELERACAO = 500
const MAX_SPEED = 80
const FRICTION = 50
var velocidade = Vector2.ZERO

func _physics_process(delta):
	var input_vetor = Vector2.ZERO
	input_vetor.x = Input.get_action_strength("ui_right") - Input.get_action_strength("ui_left")
	input_vetor.y = Input.get_action_strength("ui_down") - Input.get_action_strength("ui_up")
	input_vetor = input_vetor.normalized()
	
	if input_vetor != Vector2.ZERO:
		velocidade = velocidade.move_toward(input_vetor * MAX_SPEED, ACELERACAO * delta)
	else:
		velocidade = velocidade.move_toward(Vector2.ZERO, FRICTION * delta)
	
	velocidade = move_and_slide(velocidade)
