<?php

class Calc {
    private $operator;
    private $num1;
    private $num2;
    public function __construct(string $oper, int $numone, int $numtwo ){
        $this->operator = $oper;
        $this->num1= $numone;
        $this->num2= $numtwo;
    }
    public function calculator(){
        switch($this->operator){
            case 'add':
                return $this->num1+$this->num2;
                break;
            case 'sub':
                return $this->num1-$this->num2;
                break;
            case 'div':
                return $this->num1/$this->num2;
                break;
            case 'mul':
                return $this->num1*$this->num2;
                break;
            default:
                echo "ERROR CALC";
                break;
        }
    }

}