
# -*- coding: cp1252 -*-
def Cinematique():
    import math

    print('Bienvenue sur le Calculateur de la Cinématique')
    print('par VB')
        
    # Donnees:
    xi = 0
    xf = 0
    d_x = xf - xi
    vi = 0
    vf = 0
    d_v = vf - vi
    ti = 0
    tf = 0
    d_t = tf - ti
    a = 0

    # Equations 1:
    def vf_1(a, vi, d_t):
        return vi + a*d_t
    def vi_1(a, vf, d_t):
        return -(a*d_t - vf)
    def a_1(vi, vf, d_t):
        d_v = vf - vi
        return d_v/d_t
    def d_t_1(vi, vf, a):
        d_v = vf - vi
        return d_v/a

    # Equations 2;
    def xf_2(xi, vi, vf, d_t):
        return xi + 0.5*(vi + vf)*d_t
        #R: xf C: xi, vi, vf, d_t
    def xi_2(xf, vi, vf, d_t):    
        return -(0.5*(vi + vf)*d_t - xf)
        #R: xi C: xf, vi, vf, d_t
    def vi_2(xi, xf, vf, d_t):    
        return (2 * d_x)/(d_t) - vf
        #R: vi C: xf, xi, d_t, vf
    def vf_2(xi, xf, vi, d_t):
        return (2 * d_x)/(d_t) - vi
        #R: vf C: xf, xi, d_t, vi
    def d_t_2(xi, xf, vi, vf):
        d_x = xf - xi
        return d_x/(0.5*(vi + vf))
    # Equations 3:
    def xf_3(a, xi, vi, d_t):
        return xi + (vi*d_t) + (0.5*a*(d_t**2))
    def xi_3(a, xf, vi, d_t):
        return -((vi*d_t) + (0.5*a*(d_t**2)) - xf)
    def d_t1_3(a, xi, xf, vi):
        d_x = xf - xi
        d = vi**2 - 4*((a/2)*(d_x))
        return (-vi + math.sqrt(d))/a
    def d_t2_3(a, xi, xf, vi):
        d_x = xf - xi
        d = vi**2 - 4*((a/2)*(d_x))
        return (-vi - math.sqrt(d))/a
    def vi_3(xi, xf, a, d_t):
        d_x = xf - xi
        return (0.5*a*(d_t**2)-d_x)/-d_t
    def a_3(xi, xf, d_t, vi):
        d_x = xf - xi
        return ((vi*d_t-d_x)/(d_t**2))/(-0.5)

    # Equations 4:
    def vf_4(xi, xf, vi, a):
        d_x = xf - xi
        return math.sqrt(vi**2 + 2*a*d_x)
    def vi_4(xi, xf, vf, a):
        d_x = xf - xi
        return math.sqrt(-(2*a*d_x - (vf**2)))
    def a_4(xi, xf, vi, vf):
        return (vf**2 - vi**2)/2*d_x
    def xi_4(vi, vf, a, xf):
        return -(((vf**2 - vi**2)/(2*a)) - xf)
    def xf_4(vi, vf, a, xi):
        return ((vf**2 - vi**2)/2*a) + xi
      
    # Demande de la donnï¿½e recherchï¿½e:
    print('Quelle donnée recherchez-vous?')
    print('[xi : 1, xf : 2, vi : 3, vf : 4, d_t : 5, a : 6]')
    donneeR = int(input())

    # Demande des donnï¿½es connues:
    print('Quelles données connaissez-vous?')
    print('Oui = 1, Non = 0')
    bxf = int(input('Avez-vous "xf"?: '))
    bxi = int(input('Avez-vous "xi"?: '))
    bvi = int(input('Avez-vous "vi"?: '))
    bvf = int(input('Avez-vous "vf"?: '))
    bd_t = int(input('Avez-vous "delta temps"?: '))
    ba = int(input('Avez-vous "a"?: '))
    # Si: donneeR == 1:
    if donneeR == 1 and bxf == 1 and bvi == 1 and bvf == 1 and bd_t == 1:
        xf = float(input('xf (en m): '))
        vi = float(input('vi (en m/s): '))
        vf = float(input('vf (en m/s): '))
        d_t = float(input('delta temps (en s): '))
          
        print(xi_2(xf, vi, vf, d_t))
        print('m')
          
    elif donneeR == 1 and ba == 1 and bxf == 1 and bvi == 1 and bd_t == 1:
        d_t = float(input('delta temps (en s): '))
        a = float(input('a (en m/s^2): '))
        xf = float(input('xf (en m): '))
        vi = float(input('vi (en m/s): '))
          
        print(xi_3(a, xf, vi, d_t))
        print('m')
          
    elif donneeR == 1 and bvi == 1 and bvf == 1 and ba == 1 and bxf == 1:
        vi = float(input('vi (en m/s): '))
        vf = float(input('vf (en m/s): '))
        a = float(input('a (en m/s^2): '))
        xf = float(input('xf (en m): '))

        print(xi_4(vi, vf, a, xf))
        print('m')

    # Si: donneeR == 2:
    elif donneeR == 2 and bxi == 1 and bvi == 1 and bvf == 1 and bd_t == 1:
        xi = float(input('xi (en m): '))
        vi = float(input('vi (en m/s): '))
        vf = float(input('vf (en m/s): '))
        d_t = float(input('delta temps (en s): '))

        print(xf_2(xi, vi, vf, d_t))
        print('m')

    elif donneeR == 2 and ba == 1 and bxi == 1 and bvi == 1 and bd_t == 1:
        xi = float(input('xi (en m): '))
        vi = float(input('vi (en m/s): '))
        a = float(input('a (en m/s^2): '))
        d_t = float(input('delta temps (en s): '))

        print(xf_3(a, xi, vi, d_t))
        print('m')

    elif donneeR == 2 and bxi == 1 and bvi == 1 and bvf == 1 and ba == 1:
        xi = float(input('xi (en m): '))
        vi = float(input('vi (en m/s): '))
        vf = float(input('vf (en m/s): '))
        a = float(input('a (en m/s^2): '))

        print(xf_4(vi, vf, a, xi))
        print('m')

    # Si: donneeR == 3:
    elif donneeR == 3 and ba == 1 and bvf == 1 and bd_t == 1:
        vf = float(input('vf (en m/s): '))
        d_t = float(input('delta temps (en s): '))
        a = float(input('a (en m/s^2): '))

        print(vi_1(a, vf, d_t))
        print('m/s')

    elif donneeR == 3 and bxf == 1 and bxi == 1 and bvf == 1 and bd_t == 1:
        xi = float(input('xi (en m): '))
        xf = float(input('xf (en m): '))
        vf = float(input('vf (en m/s): '))
        d_t = float(input('delta temps (en s): '))

        print(vi_2(xi, xf, vf, d_t))
        print('m/s')

    elif donneeR == 3 and bxf == 1 and bxi == 1 and ba == 1 and bd_t == 1:
        xi = float(input('xi (en m): '))
        xf = float(input('xf (en m): '))
        d_t = float(input('delta temps (en s): '))
        a = float(input('a (en m/s^2): '))

        print(vi_3(xi, xf, a, d_t))
        print('m/s')

    elif donneeR == 3 and bxf == 1 and bxi == 1 and bvf == 1 and ba == 1:
        xi = float(input('xi (en m): '))
        xf = float(input('xf (en m): '))
        vf = float(input('vf (en m/s): '))
        a = float(input('a (en m/s^2): '))

        print(vi_4(xi, xf, vf, a))
        print('m/s')

    # Si: donneeR == 4:
    elif donneeR == 4 and ba == 1 and bvi == 1 and bd_t == 1:
        vi = float(input('vi (en m/s): '))
        d_t = float(input('delta temps (en s): '))
        a = float(input('a (en m/s^2): '))

        print(vf_1(a, vi, d_t))
        print('m/s')

    elif donneeR == 4 and bxf == 1 and bxi == 1 and bvi == 1 and bd_t == 1:
        xi = float(input('xi (en m): '))
        xf = float(input('xf (en m): '))
        vi = float(input('vi (en m/s): '))
        d_t = float(input('delta temps (en s): '))

        print(vf_2(xi, xf, vi, d_t))
        print('m/s')

    elif donneeR == 4 and bxf == 1 and bxi == 1 and bvi == 1 and ba == 1:
        xi = float(input('xi (en m): '))
        xf = float(input('xf (en m): '))
        vi = float(input('vi (en m/s): '))
        a = float(input('a (en m/s^2): '))

        print(vf_4(xi, xf, vi, a))
        print('m/s')

    # Si: donneeR == 5:
    elif donneeR == 5 and bvi == 1 and bvf == 1 and ba == 1:
        vi = float(input('vi (en m/s): '))
        vf = float(input('vf (en m/s): '))
        a = float(input('a (en m/s^2): '))

        print(d_t_1(vi, vf, a))
        print('s')

    elif donneeR == 5 and bxi == 1 and bxf == 1 and bvi == 1 and bvf == 1:
        xi = float(input('xi (en m): '))
        xf = float(input('xf (en m): '))
        vi = float(input('vi (en m/s): '))
        vf = float(input('vf (en m/s): '))

        print(d_t_2(xi, xf, vi, vf))
        print('s')

    elif donneeR == 5 and bxi == 1 and bxf == 1 and bvi == 1 and ba == 1:
        xi = float(input('xi (en m): '))
        xf = float(input('xf (en m): '))
        vi = float(input('vi (en m/s): '))
        a = float(input('a (en m/s^2): '))

        print('Deux réponses possibles: ')
        print(d_t1_3(a, xi, xf, vi))
        print('ou')
        print(d_t2_3(a, xi, xf, vi))
        print('s')

    #Si: donneeR == 6:
    elif donneeR == 6 and bvi == 1 and bvf == 1 and bd_t == 1:
        vi = float(input('vi (en m/s): '))
        vf = float(input('vf (en m/s): '))
        d_t = float(input('delta temps (en s): '))

        print(a_1(vi, vf, d_t))
        print('m/s^2')

    elif donneeR == 6 and bxi == 1 and bxf == 1 and bvi == 1 and bd_t == 1:
        xi = float(input('xi (en m): '))
        xf = float(input('xf (en m): '))
        vi = float(input('vi (en m/s): '))
        d_t = float(input('delta temps (en s): '))

        print(a_3(xi, xf, d_t, vi))
        print('m/s^2')

    elif donneeR == 6 and bxi == 1 and bxf == 1 and bvi == 1 and bvf == 1:
        xi = float(input('xi (en m): '))
        xf = float(input('xf (en m): '))
        vi = float(input('vi (en m/s): '))
        vf = float(input('vf (en m/s): '))

        print(a_4(xi, xf, vi, vf))
        print('m/s^2')

    else:
        print('Impossible à calculer à partir des données connues.')

on = True
while on:
    Cinematique()
